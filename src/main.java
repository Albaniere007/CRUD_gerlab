import java.sql.ResultSet;


    public class main {
        public static void main(String[] args) {
            conexao con=new conexao();

            //INSERINDO DADOS NA TABELA CABEÇALHO***********************************************
           String sql="insert into cabecalho_registro_de_concreto(\n" +
                    "    relatorio , \n" +
                    "    obra ,\n" +
                    "    codigo_do_traco ,\n" +
                    "    subtrecho ,\n" +
                    "    estaca,\n" +
                    "    peca_concretada ,\n" +
                    "    data_da_moldagem ,\n" +
                    "    fck,\n" +
                    "    tipo_do_cimento,\n" +
                    "    consumo_do_cimento ,\n" +
                    "    liberacao ,\n" +
                    "    fornecedor ,\n" +
                    "    slump_especificado ,\n" +
                    "    tipo_de_lancamento ,\n" +
                    "    colaborador ,\n" +
                    "    status_recebido) values( \n" +
                    "    '03-0003-22', \n" +
                    "     'Contorno Viário',\n" +
                    "     'AP.420.180.Rev01',\n" +
                    "      'Túnel 04',\n" +
                    "     '125+002',\n" +
                    "     'Revestimento primário',\n" +
                    "     '2022-06-26',\n" +
                    "     '30',\n" +
                    "     'CP-IV',\n" +
                    "     '420',\n" +
                    "     'l-1450',\n" +
                    "    'Aterpa',\n" +
                    "    '180±30',\n" +
                    "     'Projetado',\n" +
                    "     'Lucas Albaniere',\n" +
                    "     'True'\n" +
                    ");\n";


           int resultado= con.executaSQL(sql);
            if (resultado>0){
                System.out.println("Dados inseridos com sucesso");
            }else{
                System.out.println("Erro ao cadastrar");
            }

            //SELEÇÃO DO CABEÇALHO*****************************************
            conexao con1=new conexao();
            String sql1="select * from cabecalho_registro_de_concreto;";
            ResultSet resultSet=con1.executaBusca(sql1);
            try {
                while (resultSet.next()){
                    int id=resultSet.getInt("id");
                    String relatorio=resultSet.getString("relatorio");
                    String obra=resultSet.getString("obra");
                    System.out.println(id +" "+relatorio+" "+obra+".");
                }

            }catch (Exception e){
                e.printStackTrace();
            }
            //REGISTRO DE MOLDAGENS**********************************************************
            conexao con2=new conexao();
            String sql2="insert into registro_de_concreto(\n" +
                    "    \n" +
                    "   \n" +
                    "    \n" +
                    "    relatorio ,\n" +
                    "    placa_veiculo , \n" +
                    "    nota_fiscal,\n" +
                    "    hora_de_saida ,\n" +
                    "    hora_de_chegada ,\n" +
                    "    hora_de_inicio ,\n" +
                    "    hora_de_fim,\n" +
                    "    hora_de_moldagem ,\n" +
                    "    slump_real ,\n" +
                    "    volume ,\n" +
                    "    volume_acumulado ,\n" +
                    "    numero_de_cp ,\n" +
                    "    temperatura_ambiente ,\n" +
                    "    temperatura_concreto ,\n" +
                    "    tipo_de_moldagem ,\n" +
                    "    serie,\n" +
                    "    quantidade_de_cp_7dias ,\n" +
                    "    quantidade_de_cp_14dias ,\n" +
                    "    quantidade_de_cp_28dias ,\n" +
                    "    status_recebido \n" +
                    "\n" +
                    "\n" +
                    ")values('03-0002-22','kkj-2566','35789','10:45','11:01','11:20','11:54','11:35','210','6.0','6.0','2','25.7','31,3','10X20','0001','0','0','2','TRUE');\n";


            int resultado2= con2.executaSQL(sql2);
            if (resultado2>0){
                System.out.println("Dados inseridos com sucesso");
            }else{
                System.out.println("Erro ao cadastrar");
            }

            conexao con3=new conexao();
            String sql3="select * from registro_de_concreto;";
            ResultSet resultSet2=con3.executaBusca(sql3);
            try {
                while (resultSet2.next()){
                    int id=resultSet2.getInt("id");
                    String relatorio=resultSet2.getString("relatorio");
                    String placa=resultSet2.getString("placa_veiculo");
                    System.out.println(id +" "+relatorio+" "+placa+".");
                }

            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }
