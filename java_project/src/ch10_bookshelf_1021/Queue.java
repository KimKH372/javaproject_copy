package ch10_bookshelf_1021;

public interface Queue {
// 인터페이스가 뭐임? -> 메서드 목차
	void enQueue(String title);
	String deQueue();
	int getSize();
}
