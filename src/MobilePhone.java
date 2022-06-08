public class MobilePhone {
    private String brandName;
    private String color;
    private int modelNo;

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setModelNo(int modelNo) {
        if(modelNo<25 || modelNo>50) {
            this.modelNo=0;
        }
        else{
            this.modelNo=modelNo;
        }


    }

    public String getBrandName() {
        return brandName;
    }

    public String getColor() {
        return color;
    }

    public int getModelNo() {
        return modelNo;
    }

    public static void main(String[] args) {
        MobilePhone onePlus = new MobilePhone();
        onePlus.setBrandName("OnePlus");
        onePlus.setColor("Black");
        onePlus.setModelNo(1);
        System.out.println(onePlus.getBrandName());
        System.out.println(onePlus.getColor());
        System.out.println(onePlus.getModelNo());
    }
}
