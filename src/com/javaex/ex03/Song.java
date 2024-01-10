package com.javaex.ex03;
//!!!
public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	public Song() {
		System.out.println("Song(피라미터0개)");
	}

	public Song(String title, String artist, String album, String composer, String year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("Song(피라미터5개)");
	}

	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title, artist, album, composer, year);
		this.track = track;
		System.out.println("Song(피라미터6개)");
	}
	
	
	//오류 - 피라미터 속 자료형이 같아 구분하지 못함
	
	
}



