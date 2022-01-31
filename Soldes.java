	public class Soldes{
	public static void main(String [] args){
		double prixAchat;
		int categArt;

	System.out.print("Indiquer le prix d'achat de votre article : ");
	prixAchat = Lire.d();

	System.out.print("Indiquer la categorie de votre article, elle doit etre comprise entre 0 et 3 : ");
	categArt = Lire.i();

	if((categArt == 0) && (prixAchat > 0)){
	System.out.println("l'article n'est pas en solde");
	System.out.format("Le montant a payer pour votre article est de : %.2f euros \n",prixAchat);
	}
	if((categArt == 1) && (prixAchat > 0)){
	prixAchat = prixAchat - (prixAchat * 0.3);
	System.out.println("Vous avez moins 30 % sur votre article");
	System.out.format("Reste a payer pour votre article : %.2f euros \n",prixAchat);
	}
	if((categArt == 2) && (prixAchat > 0)){
	prixAchat = prixAchat - (prixAchat * 0.5);
	System.out.println("Vous avez moins 50 % sur votre article");
	System.out.format("Reste a payer pour votre article : %.2f euros \n",prixAchat);
	}
	if((categArt == 3) && (prixAchat > 0)){
	prixAchat = prixAchat - (prixAchat * 0.7);
	System.out.println("Vous avez moins 70 % sur votre article");
	System.out.format("Reste a payer pour votre article : %.2f euros \n",prixAchat);
	}
	else{
	if((categArt > 3) || (prixAchat <= 0)){
	System.out.println("Erreur, votre categorie et/ou votre prix d achat sont incorrects");
	    }
	  }
	System.out.println("Fin du programme");
	}
    } 
