Francisco Jesus 89084

maven goal: est�o associados as fases, quando uma fase � chamada, todos os seus goals s�o executados. Ou seja, um goal representa parte do build lifecycle de uma fase

principais maven phases e seus goals:as fases principais s�o: clean->clean:clean, validate, compile->compiler:compile, test->surefire:test, package->jar:jar, install->install:install
							verify, deploy->deploy:deploy

sequ�ncia de invoca��o: validate->compile->test->package->verify->install->deploy