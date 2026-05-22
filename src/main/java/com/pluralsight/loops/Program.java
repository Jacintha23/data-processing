import com.pluralsight.loops.Person;

static void main()
    {
       List<Person> people = new ArrayList<>();
        people.add(new Person("A'ja", "Wilson", 29));
        people.add(new Person("Sabrina", "Ionescu", 28));
        people.add(new Person("Cameron", "Brink", 24));
        people.add(new Person("Caitlin", "Clark", 24));
        people.add(new Person("Angel", "Reese", 24));
        people.add(new Person("Kelsey", "Plum", 31));
        people.add(new Person("Breanna", "Stewart", 31));
        people.add(new Person("Napheesa", "Collier", 29));
        people.add(new Person("Jewell", "Loyd", 32));
        people.add(new Person("Alysha", "Clark", 38));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a first or last name to search: ");
        String name = scanner.nextLine().trim().toLowerCase();

         int age = 0;
         int count = 0;

         for(Person person : people)
         {
          age += person.getAge();
          count++;
         }

         int averageAge = age / count;
         System.out.println("The average Age: " + averageAge);


         Person oldestAge = people.get(0);
         for(Person person : people) //This will go through each Person object in the people collection
         {
           if (person.getAge() > oldestAge.getAge()) //This compares the age to the current oldest person's age
           {
            oldestAge = person;
           }

         }

















    }