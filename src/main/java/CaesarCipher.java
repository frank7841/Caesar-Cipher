
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
        String[] broken = inputString.split("");
        for(String letter:broken ){
            if(letter.contains("")){
                encString += " ";
            }
            else if(letter.matches("[^a-zA-Z]")) {
                encString+=letter;

            }
            else {
                if (shiftDirection.equalsIgnoreCase("right")){
                    for(int x =0;x<alphabets.length;x++){
                        if(letter.equalsIgnoreCase(alphabets[x])){
                            if((x+shiftBy)>=alphabets.length){
                                encString += alphabets[x-26 + shiftBy];
                            }
                            else{
                                encString+=alphabets[x+shiftBy];
                            }
                        }
                    }
                }
                else{
                    for (int x = alphabets.length-1;x>=0;x--){
                        if

                    }
                }
            }
        }

     return encString;
    }
}

