package teste;

import modelo.ContaCorrente;
import modelo.GerenciadorDeImpostoDeRenda;
import modelo.SeguroDeVida;
import modelo.Tributavel;

	public class TesteTributavel {
		public static void main(String[ ] args) {
			ContaCorrente cc = new ContaCorrente (100);
			SeguroDeVida sgv = new SeguroDeVida( ) ;
			GerenciadorDeImpostoDeRenda giprenda = GerenciadorDeImposto( );

			giprenda.adiciona(cc);
			giprenda.adiciona(sgv);
			System.out.println (giprenda.getTotal( ));
		}

}
