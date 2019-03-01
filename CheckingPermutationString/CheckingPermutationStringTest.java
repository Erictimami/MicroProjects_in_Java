

public class CheckingPermutationStringTest {
	public static void main(String[] args) {
		CheckingPermutationString b1 = new CheckingPermutationString("abaaacde", "aabcde");
		CheckingPermutationString b2 = new CheckingPermutationString("abaaacbde", "aabcaadeb");
		CheckingPermutationString b3 = new CheckingPermutationString("abcbde", "aabcaadeb");
		
		System.out.println(b1.check());
        System.out.println(b2.check());
        System.out.println(b3.check());
	}

}
