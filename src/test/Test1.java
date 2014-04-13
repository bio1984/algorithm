package test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("tianhewang");
		
		ArrayList<Person> arrayList = new ArrayList<Person>();
		Person e = new Person();
		e.name = "111";
		e.age  = 11;
		arrayList.add(e);
		
		List<String> names = Test1.<Person,String>test1(arrayList,new Function1<Person, String>() {

			@Override
			public String apply(Person in) {
				return in.name;
			}
			
		});
		
		System.out.println(names + "123ßßß");
		
		
	}
	public static class Person{
		public String name;
		public int age;
	}
	
	
	public static <T,R> List<R> test1(List<T> obj, Function1<T,R> func) {
		
		List<R> result = new ArrayList<R>();
		
		for(T t : obj){
			R r = func.apply(t);
			result.add(r);
		}
		
		return result;
	}
}
