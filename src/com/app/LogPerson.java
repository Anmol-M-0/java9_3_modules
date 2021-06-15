package com.app;

import java.util.logging.Logger;

import com.models.Person;

public class LogPerson {
	private static final Logger LOGGER = Logger.getLogger(LogPerson.class.getName());
	public static void main(String[] args) {
		LOGGER.warning(new Person("reiley").toString());
	}

}
