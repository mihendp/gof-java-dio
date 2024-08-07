package dev.miguel.padroes.test.gof;

import dev.miguel.padroes.test.gof.facade.Facade;
import dev.miguel.padroes.test.gof.singleton.SingletonEager;
import dev.miguel.padroes.test.gof.singleton.SingletonLazy;
import dev.miguel.padroes.test.gof.singleton.SingletonLazyHolder;
import dev.miguel.padroes.test.gof.strategy.Comportamento;
import dev.miguel.padroes.test.gof.strategy.ComportamentoAgressivo;
import dev.miguel.padroes.test.gof.strategy.ComportamentoDefensivo;
import dev.miguel.padroes.test.gof.strategy.ComportamentoNormal;
import dev.miguel.padroes.test.gof.strategy.Robot;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robot robot = new Robot();
		robot.setComportamento(normal);
		robot.mover();
		robot.mover();
		robot.setComportamento(defensivo);
		robot.mover();
		robot.setComportamento(agressivo);
		robot.mover();
		robot.mover();
		robot.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Dalmo Mendes", "69309190");
	}

}
