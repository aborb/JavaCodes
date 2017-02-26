// SAP Labs Coding Question:
// A company has decided to hire N interns numbered from 1 to N. The days for which they are hired is 50, starting from 0 to 49.
// The interns have been given special devices which generates a number each day that will be used as a 
// password for the authentication at the office doors each morning. 
// Initially, on the 0th day, the number on the device of the kth intern will be equal to 5000*k.
// A new number is generated each day on the device in the following way : Day(i) = Day(i-1) + 5000 + i.
// Given as input number of interns (N) and the unique number, find the intern to which the number corresponds.

//Input : 2, 10000
//Output : 2

//Explanation : 10000 corresponds to Employee 2 on Day 0. 

public int codeEmployee (int numberOfEmployee, int code){
     
    for(int emp=1 ;emp <= numberOfEmployee; emp++){
    int[] arr = new int[50]; 
    arr[0] = 5000*emp;
    
    if(arr[0]==code){
        return emp;
    }
       
    for (int day = 1; day < 50 ; day++){

            arr[day] = arr[day-1] + 5000 + day;
            
            if(arr[day] == code){
                System.out.println(day);
                return emp;
            }
        }
    }
    return 0;
}