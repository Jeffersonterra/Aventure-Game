package AdventureGame;

import java.util.Scanner;
//Gerado usando chat GPT conta Jeff.tm@outlook.com
public class Adventure {
    
    public static void startAdventure() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Once upon a time, there was a brave adventurer named Jack. He had spent his entire life exploring new lands and discovering hidden treasures.\nOne day, he received a mysterious map from an old friend that led to a remote island in the middle of the ocean.");
        
        System.out.println("Excited by the prospect of a new adventure, Jack set sail immediately. As he approached the island, he noticed that it was shrouded in thick fog.\nUndeterred, he anchored his boat and set out on foot to explore the island.");
        
        System.out.println("As he wandered through the dense jungle, Jack encountered all sorts of dangerous creatures, from venomous snakes to ferocious tigers.\nBut he pressed on, determined to reach the treasure that was said to be hidden on the island.");
        
        System.out.println("Finally, after days of trekking through the jungle, Jack came upon an ancient temple. Inside, he found a room filled with gold and jewels beyond his wildest dreams.\nBut just as he was about to collect his treasure, he heard a loud rumbling sound.");
        
        System.out.println("Suddenly, the temple began to shake violently, and Jack realized that he had triggered a trap. What should Jack do?");
        
        System.out.println("1. Look for an escape route");
        System.out.println("2. Try to grab as much treasure as possible before escaping");
        
        int choice = input.nextInt();
        
        if (choice == 1) {
            System.out.println("Desperately, Jack searched for a way out, but the walls were closing in on him. Just as he thought all was lost, he spotted a small opening in the ceiling.");
            System.out.println("With all his strength, Jack climbed up and out of the temple just as it collapsed behind him. He emerged from the jungle a rich man, but also with a newfound respect for the dangers of adventure.");
        } else if (choice == 2) {
            System.out.println("Jack tried to grab as much treasure as possible, but the walls closed in on him before he could escape. The temple collapsed around him, and he was never seen again.");
        } else {
            System.out.println("Invalid choice. Please try again.");
            startAdventure();
        }
        
        System.out.println("\nAs Jack was leaving the island, he noticed a path leading deeper into the jungle. What should Jack do now?");
        System.out.println("1. Follow the path");
        System.out.println("2. Return to his boat and leave the island");
        
        choice = input.nextInt();
        
        if (choice == 1) {
            System.out.println("As Jack followed the path, he encountered a group of friendly natives who welcomed him to their village.");
            System.out.println("The natives shared their food and drink with Jack, and he spent the night learning about their culture and customs.");
            
            System.out.println("\nThe next day, the chief of the village approached Jack with an offer. 'Our village is in great danger from a fierce dragon that lives in the nearby mountains,' the chief explained.");
            System.out.println("'If you can slay the dragon and bring back its head, we will reward you with a great treasure.'");
            
            System.out.println("\nWhat should Jack do?");
            System.out.println("1. Accept the chief's offer and slay the dragon");
            System.out.println("2. Decline the offer and leave the island");
            
            choice = input.nextInt();
            if (choice == 1) {
            System.out.println("Excited by the prospect of a new challenge, Jack accepted the chief's offer and set out to slay the dragon. He traveled deep into the mountains, armed with only his sword and his wits.");

            System.out.println("After several days of tracking the dragon, Jack finally caught sight of it. It was a massive beast, with scales as black as midnight and eyes that glowed like embers.");

            System.out.println("Jack drew his sword and charged towards the dragon. But the dragon was too powerful for him, and its fiery breath left Jack badly wounded.");
            
            System.out.println("With no other option, Jack retreated back to the village, his pride wounded as much as his body. But as he recovered, he began to realize that this adventure was much bigger than he had ever thought possible.");
            
            System.out.println("He learned that the dragon was just one of many threats that loomed over the island. There were other adventurers, each with their own agendas and their own secrets.");
            
            System.out.println("There were ancient curses that haunted the island, and treasures beyond Jack's wildest dreams hidden in the most unexpected places.");
            
            System.out.println("As Jack explored the island further, he discovered that he was not alone in his quest. There were other adventurers who were seeking the treasure, each with their own strengths and weaknesses.");
            
            System.out.println("Together, they formed a team, pooling their skills and resources to uncover the island's secrets. They battled fierce creatures, deciphered ancient puzzles, and braved treacherous terrain.");
            
            System.out.println("But as they delved deeper into the island's mysteries, they realized that there was something much darker at play. There was a force that threatened to destroy not just the island, but the world as they knew it.");
            
            System.out.println("With no other choice, Jack and his team prepared for the final battle. They trained harder than ever before, honed their skills to perfection, and gathered the weapons and tools they would need.");
            
            System.out.println("As they stood before the source of the darkness, a great evil that towered over them, Jack knew that this was what he was meant to do. He had been chosen to save the island, and perhaps even the world.");
            
            System.out.println("With a mighty battle cry, Jack charged towards the evil. And as he struck the final blow, he knew that his adventure had only just begun.");        
            
                } else if (choice == 2) {
                    System.out.println("Disappointed but unharmed, Jack decided to leave the island and continue his adventures elsewhere. But as he sailed away, he couldn't shake the feeling that he had left something important behind.");
                    System.out.println("For years afterwards, Jack continued to search for his true purpose. He traveled to distant lands, fought fierce battles, and discovered hidden treasures. But no matter where he went, he couldn't forget the island and the adventure that awaited him there.");

                    System.out.println("And so, one day, Jack returned to the island, determined to finish what he had started. He knew that the adventure would be much bigger than he ever thought possible, but he was ready to face it head-on.");        
                    
                } else {
                System.out.println("Invalid choice. Please try again.");
                startAdventure();
            }
           

    
        }
        
    }
    public static void main(String[] args) {
        startAdventure();
    }
    }
