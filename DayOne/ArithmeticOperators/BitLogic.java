package ArithmeticOperators;

public class BitLogic {
	public static void main(String args[]) {
		//Demonstrate bitwise logical operators
		String binary[] = {
		"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
		"1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
		};
		int a = 3; // 0 + 2 + 1 or 0011 in binary
		int b = 6; // 4 + 2 + 0 or 0110 in binary
		int c = a | b;
		int d = a & b;
		int e = a ^ b;
		int f = (~a & b)|(a & ~b);
		int g = ~a & 0x0f;
		System.out.println(" a = " + binary[a]);
		System.out.println(" b = " + binary[b]);
		System.out.println(" a|b = " + binary[c]);
		System.out.println(" a&b = " + binary[d]);
		System.out.println(" a^b = " + binary[e]);
		System.out.println("~a&b|a&~b = " + binary[f]);
		System.out.println(" ~a = " + binary[g]);
		
		System.out.println();
		System.out.println();
		
		
		//Left Shift
		byte h = 64, i;
		int j;
		j = h << 2;
		i = (byte) (h << 2);
		System.out.println("Original value of h: " + h);
		System.out.println("j and i: " + j + " " + i);
		
		
		System.out.println();
		System.out.println();
		
		//Right Shift example
		char hex[] = {
				'0', '1', '2', '3', '4', '5', '6', '7',
				'8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
				};
		byte z = (byte) 0xf1;
		System.out.println("b = 0x" + hex[(z >> 4) & 0x0f] + hex[z & 0x0f]);
	}
}
