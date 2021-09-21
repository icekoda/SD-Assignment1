import java.io.*;

public class ConcreteDrink implements Drink {
    
    public double drinkPrice(String drinkName) throws IOException{
        Reader fileReader = new FileReader("list.csv");
        BufferedReader csvReader = new BufferedReader(new FileReader("list.csv"));
      
        
        String row;

        while ((row = csvReader.readLine()) != null) {
            if (row.contains(drinkName)){
                String[] data = row.split(",");
                Double parsedString =  Double.parseDouble(data[data.length -1]);
                return parsedString;

            }

        }
        
        
        return 0;
    }

}