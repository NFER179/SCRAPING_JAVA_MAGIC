package applicationAdministrator;

import java.util.Map;

import controller.CtrPrincipal;

public class Application {
	
//	private Map<String, String> frames;
	private CtrPrincipal mainCtr;
	
	public Application() {
		this.mainCtr = new CtrPrincipal();
//		loadFrameMap();
	}
	
	public void init() {
		this.mainCtr.Init();
	}
	
//	private void loadFrameMap() {
//		this.frames.put("MAIN", "VwPrincipal");
//	}
}
