class {
  public static void main(String[] args) {
    Scanner le = new Scanner(System.in);
    Tree arv = new Tree();
    int opcao;
    long x;
    System.out.print("\n Arvore Binaria de Vetor");
    do {
        
        System.out.print("\nEntre com a opcao:");
	System.out.print("\n ----1: Inserir");
	System.out.print("\n ----2: Excluir");
	System.out.print("\n ----3: Exibir pre-ordem");
	
	System.out.print("\n-> ");
	opcao = le.nextInt();
	switch(opcao) {
	 	case 1: {
		       System.out.print("\n Insira o valor para ser adicionado ao vetor (long) -> ");
		       x = le.nextLong();
		       arv.inserir(x);
		       break;
		}
		case 2: {
		       System.out.print("\n Informe o valor a ser excluido (long) -> ");
		       x = le.nextLong();
		       if ( !arv.remover(x) )
                          System.out.print("\n Valor nao encontrado!");;
		       break;
		
  }
   case 3: {
   arv.caminhar();
		      break;
}
