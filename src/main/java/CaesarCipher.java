
public class CaesarCipher {
    private String inputString;
    private String encString;
    private String decString;

    private final String[] alphabets = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    public CaesarCipher(String inputString) {
        this.inputString = inputString;
        this.encString = "";
        this.decString = "";
    }

    public String getInputString() {
        return inputString;
    }
    public String encryptText(String shiftDirection, int shiftBy){
        String[] brokenString = inputString.split("");
        for(String letter : brokenString ){
            if(letter.contains(" ")){
                encString += " ";
            }
            else if(letter.matches("[^a-zA-Z]")) {
                encString+=letter;

            }
            else {
                if (shiftDirection.equalsIgnoreCase("right")){
                    for(int x =0; x < alphabets.length; x++){
                        if(letter.equalsIgnoreCase(alphabets[x])){
                            if((x+shiftBy)>=alphabets.length){
                                encString += alphabets[x-26 + shiftBy];
                            }
                            else{
                                encString += alphabets[x+shiftBy];
                            }
                        }
                    }
                }
                else{
                    for (int x = alphabets.length-1;x>=0;x--)
                        if (letter.equalsIgnoreCase(alphabets[x])) {
                            if ((x - shiftBy) < 0) {
                                encString += alphabets[x + 26 - shiftBy];
                            } else {
                                encString += alphabets[x - shiftBy];
                            }
                        }
                }
            }
        }

     return encString;
    }
    public String decryptText(String shiftDirection, int shiftBy){
        String[] brokenString = inputString.split("");
        for(String letter : brokenString){
            if(letter.contains(" ")){
                decString+=" ";
            }
            else if(letter.matches("^a-zA-Z")){
                decString += letter;
            }
            else {
                if(shiftDirection.equalsIgnoreCase("right")){
                    for(int x = 0; x<alphabets.length; x++){
                        if (letter.equalsIgnoreCase(alphabets[x])){
                            if ((x+shiftBy)>=alphabets.length){
                                decString+=alphabets[x-26+shiftBy];
                            }
                            else{
                                decString+=alphabets[x+shiftBy];
                            }

                        }
                    }
                }
                else{

                }
            }
        }
        return decString;
    }
}

