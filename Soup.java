public class Soup {
    //these are instance variables 
    private String letters;  
    private String company;  

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    public void add(String word){
        letters += word;

    }


    //Use Math.random() to get a random character from the letters string and return it.
    public char randomLetter(){
        
        return letters.charAt((int)(Math.random()*letters.length()));
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
        int middle = letters.length() / 2;
        String letters_first = letters.substring(0, middle);
        String letters_end = letters.substring(middle); 
        
        return letters_first + company + letters_end;
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
        for(int index = 0;index<letters.length();index++){
            char current_letter = letters.charAt(index);
            if (current_letter == 'a' || current_letter == 'e' || current_letter == 'i'  || current_letter == 'o' || current_letter == 'u'){
                letters = letters.substring(0,index) +letters.substring(index+1,letters.length());
                break;
            }
            
        }
        
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
        int randomSpot = (int)(Math.random()*letters.length());
        int randomSpotEnd = Math.min(randomSpot+num, letters.length()-1); //cant go over max index
        String first = letters.substring(0,randomSpot);
        String second = letters.substring(randomSpotEnd);
        letters = first + second;

    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
        
    }
}
