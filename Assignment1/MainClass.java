import javax.swing.JOptionPane;
public class MainClass {
    public static void main(String[] args) {
        //弹出消息对话框
        JOptionPane.showMessageDialog(null, "发红包：","震爷手气壮",JOptionPane.WARNING_MESSAGE);
        //弹出输入对话框
        double in_money = Double.parseDouble(JOptionPane.showInputDialog("请输入红包金额："));
        int in_number = Integer.parseInt(JOptionPane.showInputDialog("请输入要发的份数："));
        LuckyMoney lucky = new LuckyMoney(in_number, in_money);
        //弹出确认对话框
        int option = JOptionPane.showConfirmDialog(null, "确认发出该红包吗？");
        if (option == JOptionPane.YES_OPTION){

            //将结果生成为一个字符串
            String output = "红包随机结果：\n";
            double[] shares = lucky.display();
            for (int i = 0; i < in_number; i++) {
                output = output + String.format("%.2f",shares[i]) +"元\n";
            }
            //弹出输出结果对话框
            JOptionPane.showMessageDialog(null, output);
        }
        else {
            JOptionPane.showMessageDialog(null, "红包已取消！","终止",JOptionPane.ERROR_MESSAGE);

        }

    }
}

