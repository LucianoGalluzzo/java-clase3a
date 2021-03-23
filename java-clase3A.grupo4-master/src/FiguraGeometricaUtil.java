public class FiguraGeometricaUtil {

    public static double areaPromedio(FiguraGeometrica arr[]){
        double totalArea = 0;
        for(int i=0; i<arr.length; i++){
            totalArea += arr[i].area();
        }
        return totalArea/arr.length;
    }
}
