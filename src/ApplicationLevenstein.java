public class ApplicationLevenstein {
    public static void main(String[] args){
        LevensteinAlgorithm lA=new LevensteinAlgorithm("abcd","abcd");
        System.out.println(lA.findDistanceAlgorithm());
    }
}
