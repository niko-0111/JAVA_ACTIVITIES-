/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Advanced;

/**
 *
 * @author Sanchez
 */
import java.util.Arrays;

public class SearchAndSortMiniTool {
     public static void main(String[] args) {

        int[] scores = {78, 81, 94, 89, 97, 88, 91, 75};
        int searchScore = 97;
        int index = -1;

        System.out.println("--- Search and Sort Program ---");

        System.out.println("Original Scores: " + Arrays.toString(scores));

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == searchScore) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Score found: " + searchScore);
            System.out.println("Index: " + index);
        } else {
            System.out.println("Score not found.");
        }

        int[] sortedScores = Arrays.copyOf(scores, scores.length);

        Arrays.sort(sortedScores);

        System.out.println("Original Scores: " + Arrays.toString(scores));
        System.out.println("Sorted Scores: " + Arrays.toString(sortedScores));
    }
}
    
}
