interface Happy {
    abstract void greet();
}

//class Morning implements Happy {
//    public void greet() {
//        System.out.println("Good Morning");
//    }
//}

void main() {
//    Morning m = new Morning();
//    m.greet();

    Happy h = ()-> System.out.println("Good Morning");
}