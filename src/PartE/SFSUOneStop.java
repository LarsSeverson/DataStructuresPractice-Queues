package PartE;
/**
 *
 * Part E
 *
 */

import java.util.PriorityQueue;

/*
    Had some issues when I was trying to use poll() method to display the info
    Had to turn the Queue into an array
 */
public class SFSUOneStop {
    // Displaying the values
    public static void display(PriorityQueue<Student> oneStopPQ, String priority) {
        System.out.println("Priority: "+priority);

        Object[] toArray = oneStopPQ.toArray();

        Student [] student = new Student[toArray.length];

        for(int i=0;i<oneStopPQ.size();i++){
            student[i]=(Student) toArray[i];
        }
        // get the priorities by using compareTo method
        for(int i=0;i<oneStopPQ.size()-1;i++){
            int k=i;
            int j;
            for(j=i+1;j<oneStopPQ.size();j++){
                if(student[j].compareTo(student[k])<0){
                    k=j;
                }
            }

            Student st=student[k];
            student[k]=student[i];
            student[i]=st;
        }
        // print info
        for(int i=0;i<oneStopPQ.size();i++){
            System.out.printf("\t%-12s%-12s%-10d%-10.2f%-10d%-14d\n",student[i].getFirstName(),student[i].getLastName(),student[i].getId(),student[i].getGpa(),student[i].getSmallQuestions(),student[i].getBigQuestions());
        }
        System.out.println();
    }
}