
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1334, 24234);
				
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1334, 13423);
		Conta conta3 = new Conta(2112, 45432);
		
		System.out.println(Conta.getTotal());
	}

}
