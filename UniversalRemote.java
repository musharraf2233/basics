package mywork;

import java.util.Scanner;

public class UniversalRemote {

	public static void main(String[] args) {
		Tv lg=new Tv();
		SetTopBox airtel=new SetTopBox();
		NetFix netFlix=new NetFix();
		SoundSystem jbl=new SoundSystem();
		
		FathersNewsChannelCommand fncc=new FathersNewsChannelCommand(lg, airtel, netFlix, jbl);
		MothersNetFlixCommand mnc=new MothersNetFlixCommand(lg, airtel, netFlix, jbl);
		MothersSerialChannelCommand mscc=new MothersSerialChannelCommand(lg, airtel, netFlix, jbl);
		Scanner s=new Scanner(System.in);
		
		Remote remote=new Remote();
		remote.SetCommand(fncc, 1);
		remote.SetCommand(mnc, 2);
		remote.SetCommand(mscc, 3);
		System.out.println("press 1 for fathers tv"+"\n"+"press 2 for mothers netflix"+"\n"+"press 3 for mothers serial");
		remote.ExecuteCommand(s.nextInt());
		

	}

}
class Tv{
	public void Av1() {
		System.out.println("Av1 is started");
	}
	public void SwitchOn() {
		System.out.println("TV is switched ON");
	}
}
class SetTopBox{
	public void NewsChannel() {
		System.out.println("news channel is started");
	}
	public void Serial() {
		System.out.println("serial is started");
	}
}
class SoundSystem{
	public void LowSoundSystem() {
		System.out.println("low volume.....sound started");
	}
	public void normalSoundSystem() {
		System.out.println("normal volume....sound started");
	}
	
}
class NetFix{
	public void NetFlixApp() {
		System.out.println("netflix app started");
	}
	public void OldMovie() {
		System.out.println("old movies started");
	}
}
interface KingsCommand{
	public void Execute();
}
class FathersNewsChannelCommand implements KingsCommand{
	Tv lg;SetTopBox airtel;NetFix netFlix;SoundSystem jbl;
	public FathersNewsChannelCommand(Tv lg, SetTopBox aitel, NetFix netFlix, SoundSystem jbl) {
		this.lg = lg;
		this.airtel = aitel;
		this.netFlix = netFlix;
		this.jbl = jbl;
	}
	@Override
	public void Execute() {
		System.out.println("fathers tv started");
		lg.SwitchOn();
		airtel.NewsChannel();
		jbl.LowSoundSystem();
		System.out.println("king enjoy watching tv");
	}
}
class MothersNetFlixCommand implements KingsCommand{
	Tv lg;SetTopBox airtel;NetFix netFlix;SoundSystem jbl;
	public MothersNetFlixCommand(Tv lg, SetTopBox aitel, NetFix netFlix, SoundSystem jbl) {
		this.lg = lg;
		this.airtel = aitel;
		this.netFlix = netFlix;
		this.jbl = jbl;
	}
	@Override
	public void Execute() {
		System.out.println("mothers tv started");
		lg.SwitchOn();
		netFlix.NetFlixApp();
		netFlix.OldMovie();
		jbl.normalSoundSystem();
		System.out.println("Queen enjoy watching tv");
	}

}
class MothersSerialChannelCommand implements KingsCommand{
	Tv lg;SetTopBox airtel;NetFix netFlix;SoundSystem jbl;
	public MothersSerialChannelCommand(Tv lg, SetTopBox aitel, NetFix netFlix, SoundSystem jbl) {
		this.lg = lg;
		this.airtel = aitel;
		this.netFlix = netFlix;
		this.jbl = jbl;
	}
	@Override
	public void Execute() {
		System.out.println("mothers serial channel is started");
		lg.SwitchOn();
		lg.Av1();
		airtel.Serial();
		jbl.LowSoundSystem();
		System.out.println("mother enjoy vaani raani");
		
	}
}
class DummyCommand implements KingsCommand{
	@Override
	public void Execute() {
		System.out.println("i am a dummy command");
	}
}
class Remote{
	KingsCommand command[]=new KingsCommand[5];
	public Remote() {
		for (int i = 0; i < command.length; i++) {
			command[i]=new DummyCommand();
		}
	}
	public void SetCommand(KingsCommand command,int slot){
		this.command[slot]=command;
	}
	public void ExecuteCommand(int slot) {
		command[slot].Execute();
	}
}