public class testBulonFilter {
    public static void main(String[] args){
        BulonFilter bf = new BulonFilter();
        bf.add("apple");
        bf.add("pencil");
        bf.add("www.baidu.com");
        bf.add("HUAWEI");

        System.out.println(bf.contains("apple"));
        System.out.println(bf.contains("pencil"));
        System.out.println(bf.contains("apple1"));
        System.out.println(bf.contains("applasse1"));
        System.out.println(bf.contains("baidu"));
        System.out.println(bf.contains("www.baidu.com"));
        System.out.println(bf.contains("HUAWEI"));
    }
}