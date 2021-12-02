package br.senai.sp.jandira.arquivo;

import br.senai.sp.jandira.ui.FrameManipulacaoArquivos;

public class Main {

	public static void main(String[] args) {
		
		Arquivo objArquivo = new Arquivo();
		
		/*String caminho = "C:\\Users\\21276662\\Desktop\\Teste\\aula.txt";
		String texto1 = "SENAI - JANDIRA - PROGRAMAÇÃO ORIENTADA A OBJETOS - JAVA";
		String texto2 = objArquivo.ler(caminho) + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec volutpat nisl nec risus commodo dictum. Aliquam tincidunt nec eros vitae vestibulum. Mauris vitae nibh in enim varius consectetur. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nulla vitae nisl condimentum, pretium nibh vitae, vehicula felis. Suspendisse sit amet vestibulum leo. Etiam iaculis turpis quis orci tempus, sed porta metus hendrerit. Morbi nulla libero, dictum id pellentesque in, interdum id quam. Nulla lacus augue, varius eget lectus faucibus, hendrerit pulvinar nisl. Suspendisse eget venenatis turpis. Sed vitae consectetur neque. Sed vehicula nisi ac nulla faucibus dapibus. Pellentesque vulputate egestas purus quis dignissim. Ut massa neque, convallis vitae nisi vitae, consequat porttitor lacus.";
		
		
		System.out.println(texto2);*/
		
		//objArquivo.escrever(caminho, texto2);
		
		FrameManipulacaoArquivos frame = new FrameManipulacaoArquivos();
		frame.setVisible(true);
	
		
	}

}
