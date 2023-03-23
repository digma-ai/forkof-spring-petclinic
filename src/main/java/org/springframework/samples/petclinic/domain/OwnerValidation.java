package org.springframework.samples.petclinic.domain;

import io.opentelemetry.instrumentation.annotations.WithSpan;

import java.util.concurrent.locks.Lock;

public class OwnerValidation {

	private int counter =0;

	@WithSpan
	public  void ValidateOwnerWithExternalService(){

		this.CommunicateWithServer();
	}

	@WithSpan
	private synchronized  void CommunicateWithServer(){
		try {
			Thread.sleep(2000 + (this.counter*100));
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
