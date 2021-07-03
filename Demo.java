import java.security.MessageDigest;
class Demo {
        public static void main(String[] args) {
                String text = "hoge";
                byte[] cipher_byte;
                try{
                        MessageDigest md = MessageDigest.getInstance("SHA-256");
                        md.update(text.getBytes());
                        cipher_byte = md.digest();
                        StringBuilder sb = new StringBuilder(2 * cipher_byte.length);
                        for(byte b: cipher_byte) {
                                sb.append(String.format("%02x", b&0xff) );
                        }
                        System.out.println( sb );
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
}