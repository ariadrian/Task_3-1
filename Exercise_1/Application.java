public class Application{
 	private String appName;
 	private int appSize;
 	
 	public Application(String appName, int appSize){
 		this.appName = appName;
 		this.appSize = appSize;
 	}
 	
 	public String getAppName(){
 		return appName;
	}
	
 	public int getAppSize(){
 		return appSize;
 	}
 	
 	public String toString(){
 		return "Application Name : " + appName + ", with size : " + appSize + " MB";
 	}
 }
 
//Ari Adrian Ibrahim
//1301142301
//IF 38 01
