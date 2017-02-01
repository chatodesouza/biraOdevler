package com.birahw.odevler.odev1;

public class PrimitiveCreater {

	// byte: The byte data type is an 8-bit signed two's complement integer.
	private byte helloByte = 10;

	// short: The short data type is a 16-bit signed two's complement integer.
	// actually matters.
	private short helloShort = 1001;

	// int: By default, the int data type is a 32-bit signed two's complement
	// integer, which has a minimum value of -231 and a maximum value of 231-1.
	private int helloInt = 735;

	// long: The long data type is a 64-bit two's complement integer.
	private long helloLong = 23213132;

	// float: The float data type is a single-precision 32-bit IEEE 754 floating
	// point.
	private float helloFloat = 3213123;

	// double: The double data type is a double-precision 64-bit IEEE 754
	// floating point.
	private double helloDouble = 231321.0010213;

	// boolean: The boolean data type has only two possible values: true and
	// false.
	private boolean helloBoolean = true;

	// char: The char data type is a single 16-bit Unicode character.
	private char helloChar = 'x';

	protected byte getHelloByte() {
		return this.helloByte;
	}

	protected short getHelloShort() {
		return this.helloShort;
	}

	protected int getHelloInt() {
		return this.helloInt;
	}

	protected long getHelloLong() {
		return this.helloLong;
	}

	protected float getHelloFloat() {
		return this.helloFloat;
	}

	protected double getHelloDouble() {
		return this.helloDouble;
	}

	protected boolean isHelloBoolean() {
		return this.helloBoolean;
	}

	protected char getHelloChar() {
		return this.helloChar;
	}

}
