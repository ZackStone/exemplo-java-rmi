import java.rmi.Naming; 

public class CalculatorServer implements java.rmi.Remote { 
	
	public CalculatorServer() { 
		
		try {				
			System.setProperty("java.rmi.server.hostname","192.168.0.1");
			System.setProperty("java.rmi.server.logCalls","true");				
			Calculator c = new CalculatorImpl(); 
			Naming.rebind("//192.168.0.1:1099/CalculatorService", c); 
		} catch (Exception e) { 
			System.out.println("Trouble: " + e); 
		}
	}

	public static void main(String args[]) { 
			new CalculatorServer();
	}
	
} 
