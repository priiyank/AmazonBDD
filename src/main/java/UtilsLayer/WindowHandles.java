

	
	package UtilsLayer;


	import java.util.ArrayList;

	import java.util.Iterator;
	import java.util.Set;

	import BaseLayer.BaseClass;

	public class WindowHandles extends BaseClass{

		public static ArrayList<String> handleWindow() {
			ArrayList<String> handleWindow = null;
			Iterator<String> it = handleWindow.iterator();
			ArrayList<String> arr = new ArrayList<String>();

			while (it.hasNext()) {
				arr.add(it.next());
			}

			return arr;
		}

	}

