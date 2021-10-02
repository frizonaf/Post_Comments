package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = new Date();
		
		System.out.println("Quantas viagens você fez? ");
		int number = sc.nextInt();
		
		for (int i = 0; i < number; i++) {
			System.out.print("Viagem #" + (i + 1) + ": ");
			String travel = sc.nextLine();
			System.out.print("Quanto likes: ");
			int likes = sc.nextInt();
			System.out.println("Título da viagem: ");
			String content = sc.nextLine();
			
			Post post = new Post(data, travel, content, likes);
			
			System.out.println();
			System.out.print("Quantos comentários? ");
			int numberComment = sc.nextInt();
			
			for (int j = 0; j < numberComment; j++) {
				System.out.println();
				System.out.print("Digite o commentário #" + (j + 1) + ": ");
				String comment = sc.nextLine();
				Comment c = new Comment(comment);
				post.addComment(c);			
			}
			
		}
		
		for ()
		
		sc.close();

	}

}
