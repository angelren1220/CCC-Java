/* 
 * Problem Description
Rebecca is a tour guide and is trying to market the Rocky Mountains for her magazine. She recently took a beautiful picture consisting of N mountains where the i-th mountain from the left has a height hi. She will crop this picture for her magazine, by possibly removing some mountains from the left side of the picture and possibly removing some mountains from the right side of the picture. That is, a crop consists of consecutive mountains starting from the l-th to the r-th mountain where l ≤ r. To please her magazine readers, Rebecca will try to find the most symmetric crop.
We will measure the asymmetric value of a crop as the sum of the absolute difference for
every pair of mountains equidistant from the midpoint of the crop. To help understand that
definition, note that the absolute value of a number v, written as |v|, is the non-negative
value of v: for example |−6| = 6 and |14| = 14. The asymmetric value of a crop is the sum
of all |hl+i − hr−i| for 0 ≤ i ≤ r−l. To put that formula in a different way, we pair up the 2
mountains working from the outside in toward the centre, calculate the absolute difference in height of each of these pairs, and sum them up.
Because Rebecca does not know how wide the picture needs to be, for all possible crop lengths, find the asymmetric value of the most symmetric crop (the crop with the minimum asymmetric value).
 */

/*
 * Input Specification
The first line consists of an integer N, representing the number of mountains in the picture. The second line consists of N space-separated integers, where the i-th integer from the left represents hi.
 */

/*
 * Output Specification
Output on one line N space-separated integers, where the i-th integer from the left is the asymmetric value of the most symmetric picture of crops of length i.
 */

public class CCC_23_S2 {
  
}