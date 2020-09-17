package controller;

public class ThreadId extends Thread{
	//SO
	public ThreadId() {
		super();
	}
	
	@Override
	public void run() {
		System.out.println("Thread " + getId());
	}
}
