//Name: Zaid Zamani
//Date: 09/29/26
//Description: This program will produce an alphabet soup

public class Soup {
    //these are instance variables 
    private String letters;  
    private String company;  

    // Precondition: none
    // Postcondition: just creates the class
    public Soup(){
        letters ="";
        company = "none";
    }


    // Precondition: must be valid string and not null
    // Postcondition: returns nothing but setts the company to your input
    public void setCompany(String company){
        this.company = company;
    }

    // Precondition: the company name must be valid string
    // Postcondition: returns the companny name
    public String getCompany(){
        return company;
    }

    // Precondition: the letters must be a balid string
    // Postcondition: returns the letters 
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    // Precondition: the word string must be valid and not null
    // Postcondition: adds the word you inputted to the letters variable
    public void add(String word){
        letters += word;

    }


    // Precondition: letters var must be valid and not null
    // Postcondition: returns a random letter from the letters string
    public char randomLetter(){
        
        return letters.charAt((int)(Math.random()*letters.length()));
    }


    // Precondition: must be a company and letters
    // Postcondition: returns the company inbetween the middle of all the letters
    public String companyCentered(){
        int middle = letters.length() / 2;
        String letters_first = letters.substring(0, middle);
        String letters_end = letters.substring(middle); 
        
        return letters_first + company + letters_end;
    }


    // Precondition: there must be letters and it must be a valid string and not null
    // Postcondition: the first vowel in letters will be removed
    public void removeFirstVowel(){
        for(int index = 0;index<letters.length();index++){
            char current_letter = letters.charAt(index);
            if (current_letter == 'a' || current_letter == 'e' || current_letter == 'i'  || current_letter == 'o' || current_letter == 'u'){
                letters = letters.substring(0,index) +letters.substring(index+1,letters.length());
                break;
            }
            
        }
        
    }

    // Precondition: number must not be longer than the length of the string, must be a valid number
    // Postcondition: will remove the amount of nums at a random index in the letters string
    public void removeSome(int num){
        int randomSpot = (int)(Math.random()*(letters.length()-num+1));
        int randomSpotEnd = randomSpot+num;
        String first = letters.substring(0,randomSpot);
        String second = letters.substring(randomSpot + num);
        letters = first + second;

    }

    // Precondition: word must be a valid strin gand not null
    // Postcondition: it will remove the word from letters, the first instance of it
    public void removeWord(String word){
        int wordStart = letters.indexOf(word);
        letters = letters.substring(0, wordStart) + letters.substring(wordStart + word.length());
    }
}
