package com.example;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public class CheckerFrameworkAnnotationSample {

	@NonNull
	public static String nonNullMethod() {
		return null;
	}

	@Nullable
	public static String checkForNullMethod() {
		return null;
	}

	@Nullable
	public static String nullableMethod() {
		return null;
	}

	public static void main(String[] args) {
		String str;
		str = nonNullMethod().trim();
		System.out.println(str);
		str = checkForNullMethod().trim();
		System.out.println(str);
		str = nullableMethod().trim();
		System.out.println(str);
	}

}
