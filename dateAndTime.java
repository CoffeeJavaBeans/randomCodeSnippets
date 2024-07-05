/* 
https://www.hackerrank.com/challenges/java-date-and-time/problem
Date and time! Ahhh I've never wanted to do a problem less, so that is exactly why I am going to do it! 
First, after some google I find some documentation on the Java Calendar class. This looks like Java 8
so there might be a more updated one, but I'll check this one out to see what it can tell me.
https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html
So, the documentation says it's abstract, so it looks like we cannot just use it we have to extend it,
but it also implements Serializable, Cloneable, Comparable<Calendar>. But not to fear! It has a child
class GregorianCalendar that looks promising for this task. Time to take a quick documentation reading
spree and get back to this...

Hmm so it looks like GregorianCalendar has a contrstuctor that looks promising to help solve this since:
public GregorianCalendar(int year,int month,int dayOfMonth)

So it creates a GregorianCalendar object and there's a public static final DAY_OF_WEEK field in Calendar so I 
wonder if this is the thing we nead? OOOOhHH trying this yeilded a 5, getting closer!: (I bet there's an ENUM
calling my name somewhere close)
      Calendar gc= new GregorianCalendar(2017,8,14);
      System.out.println(gc.get(Calendar.DAY_OF_WEEK));

I did find this, although it looks like a future version? Well still it might help? Very sus looking
path but still checking it out... importing java.time.DayOfWeek didn't give an error in netbeans so maybe
it's okay..
https://download.java.net/java/early_access/jdk24/docs/api/java.base/java/time/class-use/DayOfWeek.html

Now I have this so closer because it prints out Friday. Let me put my findings into Hackkerank and see how it goes
(Using variables instead of hard coded date obviously) Wait no, first day would need to be converted to a string
somehow because we also need it in all caps.
 Calendar gc= new GregorianCalendar(2017,8,14);
        int dayOftheWeek=gc.get(Calendar.DAY_OF_WEEK);
        DayOfWeek day = DayOfWeek.of(dayOftheWeek);
        System.out.println(day);

The following code does indeed print a day, but I fail the test cases because it returns the wrong day. Hmm.
I suspect this might have to do with offsets? Like how in arrays 0,1,2... instead of 1,2,3.. maybe dates need
and offset like that? 
*/
public static String findDay(int month, int day, int year) {
        Calendar gc= new GregorianCalendar(year,month,day);
        int dayOftheWeek=gc.get(Calendar.DAY_OF_WEEK);
        DayOfWeek theday = DayOfWeek.of(dayOftheWeek);
        String sDay=theday.toString();
        return sDay;

    }

//Soo trying offsets worked! Problem solved!
  public static String findDay(int month, int day, int year) {
        Calendar gc= new GregorianCalendar(year,month-1,day-1);
        int dayOftheWeek=gc.get(Calendar.DAY_OF_WEEK);
        DayOfWeek theday = DayOfWeek.of(dayOftheWeek);
        String sDay=theday.toString();
        return sDay;

    }
