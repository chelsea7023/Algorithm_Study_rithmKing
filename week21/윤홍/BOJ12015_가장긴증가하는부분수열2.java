����   = l
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     nextInt ()I
      BOJ12015/Main LIS ([I)V	 
    out Ljava/io/PrintStream;	  ! " # answer I
 % & ' ( ) java/io/PrintStream println (I)V + java/util/ArrayList
 * 
  . / 0 binarySearch (Ljava/util/List;I)I 2 3 4 5  java/util/List size
 7 8 9 : ; java/lang/Integer valueOf (I)Ljava/lang/Integer; 2 = > ? set '(ILjava/lang/Object;)Ljava/lang/Object; 2 A B C add (Ljava/lang/Object;)Z 2 E F G get (I)Ljava/lang/Object;
 7 I J  intValue Code LineNumberTable LocalVariableTable this LBOJ12015/Main; main ([Ljava/lang/String;)V i args [Ljava/lang/String; sc Ljava/util/Scanner; N arr [I StackMapTable T Y pos num lis Ljava/util/List; LocalVariableTypeTable %Ljava/util/List<Ljava/lang/Integer;>; mid list r left right 	Signature )(Ljava/util/List<Ljava/lang/Integer;>;I)I 
SourceFile 	Main.java !       " #        K   /     *� �    L        M        N O   	 P Q  K   �     9� Y� 	� L+� =�
N6� -+� O����-� � �  � $�    L   & 	            %  +  /  8  M   4    R #    9 S T    . U V   ) W #   % X Y  Z    �   [  \  �      K   �     \� *Y� ,L*M,�>6� ?,.6+� -6+� 1 � +� 6� < W� +� 6� @ W����+� 1 �  �    L   & 	        $   / ! @ # L  R ' [ * M   *  $ ( ] #   0 ^ #    \ X Y    T _ `  a      T _ b  Z    �   \ 2 \  � /� �   / 0  K   �     ;=*� 1 d>� ,`l6*� D � 7� H� `=� d>����    L   & 	   -  .  0  1  3 ) 4 1 6 6 8 9 : M   4    c #    ; d `     ; e #   9 f #   0 g #  a       ; d b   Z    � � %�  h    i  j    k