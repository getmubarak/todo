package problem1;

class InvalidStateException extends RuntimeException{
}

interface State
{
	void start();
	void stop();
	void pause();
	void resume();
}
class Idle implements State
{
	public void start() { 
		//logic
	}
	void stop(){
		throw new InvalidStateException();
	}
	void pause(){
		throw new InvalidStateException();
	}
	void resume(){
		throw new InvalidStateException();
	}
}
class Running implements State
{
	public void start(){
		throw new InvalidStateException();
	}
	void stop(){
		//logic
	}
	void pause(){
		//logic
	}
	void resume(){
		throw new InvalidStateException();
	}
}
class Suspended implements State
{
	public void start() { 
		throw new InvalidStateException();
	}
	void stop(){
		//logic
	}
	void pause(){
		throw new InvalidStateException();
	}
	void resume(){
		//logic
	}
}
public class StopWatch {
	State state = new Idle();
	public void start(){
		state.start();
		state = new Running();
	}
	public boolean stop(){
		state.stop();
		state = new Idle();
	}
	public boolean pause(){
		state.pause();
		state = new Suspended();
	}
	public boolean resume(){
		state.resume();
		state = new Running();
	}
}
