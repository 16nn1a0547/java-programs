import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class TestNashorn {
	public static void main(String args[]) {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("graal.js");

		if(engine == null) {
			System.out.println("Nashorn Engine Not found. ");
		} else {
			try {
				 engine.eval("print('Welcome to JavaScript inside Java')");
		 		Object val = engine.eval("var a = 10; var b = 20; a+b;");
		 		System.out.println("Returned Value is -> " + val.toString());
			} catch(ScriptException e) {
				e.printStackTrace();
			}
		}
	}
}