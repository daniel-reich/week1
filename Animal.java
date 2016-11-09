public class Animal {
    String name;
    
    public void makeSound() {
        System.out.println("Animal sound!");
    }
     
     @Override
    public String toString() {
        return this.name;
    }
    
        public class Mammal extends Animal {
            public Mammal() {
            this.name = "Mammal";
            }
        }
        
        public class Reptile extends Animal {
            public Reptile() {
            this.name = "Reptile";
            }
        }
        
        public class Bird extends Animal {
            public Bird() {
            this.name = "Bird";
            }
        }
        
        public class Dog extends Mammal {
            public Dog() {
                this.name = "Dog";
                }

            @Override
            public void makeSound() {
                System.out.println("Bark!");
                 }
            }

        public class Snake extends Reptile {
            public Snake() {
                this.name = "Snake";
                }

            @Override
            public void makeSound() {
                System.out.println("Sssssssss!");
                }
            }

        public class Hawk extends Bird {
            public Hawk() {
                this.name = "Hawk";
                }

            @Override
            public void makeSound() {
                System.out.println("Cawwww!");
                }
            }

}



