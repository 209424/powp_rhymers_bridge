package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	public FIFORhymer() {
	}

	public FIFORhymer(IntLinkedList intLinkedList) {
		super(intLinkedList);
	}

	@Override
	public int countOut() {
		while (!callCheck())
			
		temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.callCheck())
			
		countIn(temp.countOut());
		
		return ret;
	}
}
