package com.vois.autotask;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class Main extends sendFiles {

	static Screen s = new Screen();

	public static void openFile() throws FindFailed, InterruptedException {
		s.find("/Users/hadilekhalifa/desktop/Desktop.sikuli/data.png");
		s.doubleClick();

		System.out.println("excel file opened");

		Thread.sleep(3000);


	}


	public static void editingExcel() throws FindFailed, InterruptedException {

		openFile();

		s.find("/Users/hadilekhalifa/Desktop/e.sikuli/Sortbydate.png");
		s.doubleClick();

		Thread.sleep(3000);

		s.find("/Users/hadilekhalifa/Desktop/e.sikuli/Sort.png");
		s.click();

		Thread.sleep(3000);

		s.type(Key.DOWN);
		s.type(Key.ENTER);


		Thread.sleep(3000);

		s.find("/Users/hadilekhalifa/Desktop/e.sikuli/confirmSort.png");
		s.click();
		
		//removing duplicates 
		s.find("/Users/hadilekhalifa/Desktop/e.sikuli/duplicatesColumn.png");
		s.doubleClick();

		Thread.sleep(3000);

		s.find("/Users/hadilekhalifa/Desktop/e.sikuli/openData.png");
		s.click();

		Thread.sleep(3000);

		s.find("/Users/hadilekhalifa/Desktop/e.sikuli/removeDuplicates.png");
		s.doubleClick();

		Thread.sleep(3000);

		s.find("/Users/hadilekhalifa/Desktop/e.sikuli/confirmRemove.png");
		s.doubleClick();

		Thread.sleep(3000);

		s.type(Key.DOWN);
		s.type(Key.SPACE);
		s.type(Key.DOWN);
		s.type(Key.DOWN);
		s.type(Key.SPACE);
		
		Thread.sleep(3000);

		s.find("/Users/hadilekhalifa/Desktop/e.sikuli/confirmOk.png");
		s.doubleClick();
		
		s.type(Key.ENTER);
		
		s.find("/Users/hadilekhalifa/Desktop/e.sikuli/save.png");
		s.doubleClick();
	
		
	}

	

	public static void main(String[] args) throws FindFailed, InterruptedException, AWTException {
		editingExcel();
		upload();






	}
}
