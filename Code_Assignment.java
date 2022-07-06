package code_assigment;

import io.restassured.path.json.JsonPath;

public class Code_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonPath js= new JsonPath(RcbPayload1.rcbData());
		// String name=js.getString("player[1].name");
		// System.out.println(name);
		 int counter=0;
		 int wicketCounter=0;
		 int count=js.getInt("player.size()");
		 //System.out.println(count);
		 //String country=js.getString("player[0].country");
		 //System.out.println(country);
		 for(int i=0;i<count;i++) {
			 String country=js.getString("player["+i+"].country");
			 if(!country.equals("India")) {
				 counter++;
			 }
			 String role=js.getString("player["+i+"].role");
			 if(role.equals("Wicket-keeper")) {
				wicketCounter++; 
			 }
		 }
		 System.out.println("There are 4 foreign players playing in RCB :"+counter);
		 System.out.println("Theare is/are : "+wicketCounter+" wicket keeper in RCB");
		}

	}


