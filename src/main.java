import java.sql.ResultSet;


    public class main {
        public static void main(String[] args) {
            conexao con=new conexao();

            //INSERINDO DADOS NA TABELA***********************************************
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

           conexao con1=new conexao();
           int resultado= con1.executaSQL(sql);
            if (resultado>0){
                System.out.println("Dados inseridos com sucesso");
            }else{
                System.out.println("Erro ao cadastrar");
            }

            String sql1="select * from cabecalho_registro_de_concreto;";
            ResultSet resultSet=con.executaBusca(sql1);
            try {
                while (resultSet.next()){
                    int id=resultSet.getInt("id");
                    String relatorio=resultSet.getString("relatorio");
                    String obra=resultSet.getString("obra");
                    System.out.println(" "+relatorio+" "+obra+".");
                }

            }catch (Exception e){
                e.printStackTrace();
            }



        }

    }
