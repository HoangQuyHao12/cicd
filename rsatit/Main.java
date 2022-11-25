package rsatit;

import java.math.BigInteger;

public class Main {

              /**
               * @param args
               */
              public static void main(String args[]) {
                            RSA person1 = new RSA();
                            RSA person2 = new RSA();
                            person1.initialize();
                            person2.initialize();
                            BigInteger message = new BigInteger("23052021");
                            BigInteger cipher = person1.encrypt(message, person2.getN());
                            BigInteger decrypted = person2.decrypt(cipher);
                            System.out.println(message);
                            System.out.println(decrypted);

              }
}