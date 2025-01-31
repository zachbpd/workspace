import java.util.ArrayList;
 
 public class OneC {
 
     public static String[] getDomainLabels(String url) {
         if (url.contains("/")) return (url.substring(0, url.indexOf("/"))).split(".");
         else return url.split(".");
     }
 
     public static void reverseArray(String[] labels) {
    	for(int i=0;i<labels.length/2;i++){
    		String s = labels[i];
    		labels[i]=labels[labels.length-i-1];
    		labels[labels.length-i-1]=s;
    	}
     }
 
     public static String arrayToString(String[] labels) {
         String s = "";
         for (String l:labels)
        	 s+=l+".";
         return s.substring(0, s.length()-1);
     }
 
     public static ArrayList<String> textToReversedDomains(String filename) {
    	 ArrayList<String> r=new ArrayList<String>();
    	 StdIn.redirectInput(filename);
 		while(!StdIn.isEmpty()){
 			String line=StdIn.readLine();
 			if(line.substring(0,4).equals("www.")){
				String [] d=getDomainLabels(line);
				reverseArray(d);
				r.add(arrayToString(d));
				}
 			}
			return r;
 		}
     }
