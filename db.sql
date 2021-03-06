USE [master]
GO
/****** Object:  Database [project]    Script Date: 11/11/2020 10:59:53 PM ******/
CREATE DATABASE [project]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'project', FILENAME = N'D:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\project.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'project_log', FILENAME = N'D:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATAproject_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [project] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [project].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [project] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [project] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [project] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [project] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [project] SET ARITHABORT OFF 
GO
ALTER DATABASE [project] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [project] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [project] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [project] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [project] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [project] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [project] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [project] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [project] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [project] SET  ENABLE_BROKER 
GO
ALTER DATABASE [project] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [project] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [project] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [project] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [project] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [project] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [project] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [project] SET RECOVERY FULL 
GO
ALTER DATABASE [project] SET  MULTI_USER 
GO
ALTER DATABASE [project] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [project] SET DB_CHAINING OFF 
GO
ALTER DATABASE [project] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [project] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [project] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'project', N'ON'
GO
ALTER DATABASE [project] SET QUERY_STORE = OFF
GO
USE [project]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 11/11/2020 10:59:53 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[username] [nvarchar](50) NULL,
	[password] [nvarchar](50) NULL,
	[admin] [bit] NULL,
	[userid] [int] IDENTITY(1,1) NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[userid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Brand]    Script Date: 11/11/2020 10:59:53 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Brand](
	[id] [int] NOT NULL,
	[name] [nvarchar](50) NULL,
 CONSTRAINT [PK_Brand] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Cart]    Script Date: 11/11/2020 10:59:53 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cart](
	[userid] [int] NULL,
	[amount] [int] NULL,
	[totalprice] [float] NULL,
	[id] [int] IDENTITY(1,1) NOT NULL,
	[price] [float] NULL,
	[productid] [int] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Product]    Script Date: 11/11/2020 10:59:53 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[name] [nvarchar](max) NULL,
	[title] [nvarchar](max) NULL,
	[description] [nvarchar](max) NULL,
	[brandId] [int] NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[image] [nvarchar](50) NULL,
	[price] [int] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
ALTER TABLE [dbo].[Cart]  WITH CHECK ADD FOREIGN KEY([userid])
REFERENCES [dbo].[Account] ([userid])
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD FOREIGN KEY([brandId])
REFERENCES [dbo].[Brand] ([id])
GO
USE [master]
GO
ALTER DATABASE [project] SET  READ_WRITE 
GO
use project
SET IDENTITY_INSERT [dbo].[Account] ON 

INSERT [dbo].[Account] ([username], [password], [admin] , [userid]) VALUES (N'mra', N'mra', 1, 2)
INSERT [dbo].[Account] ([username], [password], [admin], [userid]) VALUES (N'mrb', N'mrb', 0, 3)
INSERT [dbo].[Account] ([username], [password], [admin], [userid]) VALUES (N'mrc', N'mrc', 0, 4)
INSERT [dbo].[Account] ([username], [password], [admin], [userid]) VALUES (N'hieu123', N'123', 0, 5)
SET IDENTITY_INSERT [dbo].[Account] OFF
INSERT [dbo].[Brand] ([id], [name]) VALUES (1, N'Nike')
INSERT [dbo].[Brand] ([id], [name]) VALUES (2, N'Adidas')
INSERT [dbo].[Brand] ([id], [name]) VALUES (3, N'Converse')
INSERT [dbo].[Brand] ([id], [name]) VALUES (4, N'Vans')
SET IDENTITY_INSERT [dbo].[Cart] ON 

INSERT [dbo].[Cart] ([userid], [amount], [totalprice], [id], [price], [productid]) VALUES (1, N'200       ', 400, 1, 2, 1)
INSERT [dbo].[Cart] ([userid], [amount], [totalprice], [id], [price], [productid]) VALUES (1, N'2         ', 1000, 2, 500, 1)
INSERT [dbo].[Cart] ([userid], [amount], [totalprice], [id], [price], [productid]) VALUES (1, N'2         ', 1000, 3, 500, 1)
INSERT [dbo].[Cart] ([userid], [amount], [totalprice], [id], [price], [productid]) VALUES (1, N'2         ', 1000, 4, 500, 1)
INSERT [dbo].[Cart] ([userid], [amount], [totalprice], [id], [price], [productid]) VALUES (1, N'2         ', 1000, 5, 500, 1)
SET IDENTITY_INSERT [dbo].[Cart] OFF
SET IDENTITY_INSERT [dbo].[Product] ON 
INSERT [dbo].[Product] ([name], [title], [description], [brandId], [ID], [image], [price]) VALUES (N'Giày thể thao NIKE DARWIN', N'Giày thể thao nam Nike Darwin 819803-401 màu xanh dương nhạt​ ', N'Giày thể thao nam Nike Darwin 819803-401 màu xanh dương nhạt​ với thiết kế kiểu dáng cùng gam màu thời trang, mang đến cho bạn nam sự trẻ trung, năng động nhưng cũng không kém phần sành điệu dù là đang tham gia các hoạt động thể thao hay phối cùng các trang phục hàng ngày khác. Bên cạnh đó, giày được may từ chất liệu vải thể thao chuyên dụng Polyester, bề mặt và lớp lót dạng lưới thoáng khí, mũi giày đầy đặn bảo vệ đầu ngón chân; đế cao su nhẹ và siêu bền chống trơn trượt hiệu quả, đem lại sự thoải mái và dễ chịu khi tiếp đất.', 1, 1, N'nike1.PNG', 300000)
INSERT [dbo].[Product] ([name], [title], [description], [brandId], [ID], [image], [price]) VALUES (N'Giày Nike Air Zoom Pegasus 36', N'Giày Nike Air Zoom Pegasus 36 là mẫu giày phiên bản thứ 36 của dòng giày huyền thoại Nike Air Zoom Pegasus', N'Giày Nike Air Zoom Pegasus 36 Nữ- Xanh
Giày Nike Air Zoom Pegasus 36 là mẫu giày phiên bản thứ 36 của dòng giày huyền thoại Nike Air Zoom Pegasus, đã có truyền thống từ năm 1983. Đến nay các nhà sản xuất của Nike đã cải tiến, nâng cấp những công nghệ và cho ra đời siêu phẩm 2019 Nike Air Zoom Pegasus 36.

Và sau đây hãy để Myshoes.vn - Giày Chính Hãng review đôi giày cực phẩm này cho các bạn nhé!

Đầu tiên khi nhìn vào Nike Air Zoom Pegasus 36 chúng ta có thể thấy ở phiên bản mới này được thừa hưởng kiểu dáng thiết kế từ người anh Pegasus 35. Song các công nghệ đã được nâng cấp lên một tầm cao mới.', 1, 2, N'nike2.PNG', 400000)
INSERT [dbo].[Product] ([name], [title], [description], [brandId], [ID], [image], [price]) VALUES (N'Giày Nike Legend React', N'Giày Nike Legend React Nữ -Trắng Xanh', N'Nike Legend React -một mẫu giày chạy bộ được coi là huyền thoại trong làng chạy bộ của các giày thể thao. Với thiết kế luôn nâng cao tính đơn giản, gọn và đặc biệt nhẹ. Nike Legend React sẽ giúp bạn trải nghiệm nhiều hơn một đôi giày thể thao bình thường. Phần vải Upper, được sử dụng vải Mesh giúp cho bàn chân luôn khô ráo, thoáng mát, không bí bách. Đế React, chưa bao giờ làm thất vọng một khách hàng nào của Nike. Màu sắc trẻ trung, hiện đại sẽ giúp bạn phối hợp được nhiều kiểu quẩn áo để biến tấu nó thành một đôi giày đi thời trang hàng ngày.', 1, 3, N'nike3.PNG', 500000)
INSERT [dbo].[Product] ([name], [title], [description], [brandId], [ID], [image], [price]) VALUES (N'Giày Nike Air Zoom Pegasus', N'Giày Nike Air Zoom Pegasus 36 Nam - Đỏ', N'Giày Nike Air Zoom Pegasus 36 là mẫu giày phiên bản thứ 36 của dòng giày huyền thoại Nike Air Zoom Pegasus, đã có truyền thống từ năm 1983. Đến nay các nhà sản xuất của Nike đã cải tiến, nâng cấp những công nghệ và cho ra đời siêu phẩm 2019 Nike Air Zoom Pegasus 36.

Và sau đây hãy để Myshoes.vn - Giày Chính Hãng review đôi giày cực phẩm này cho các bạn nhé!

Đầu tiên khi nhìn vào Nike Air Zoom Pegasus 36 chúng ta có thể thấy ở phiên bản mới này được thừa hưởng kiểu dáng thiết kế từ người anh Pegasus 35. Song các công nghệ đã được nâng cấp lên một tầm cao mới.', 1, 4, N'nike4.PNG', 600000)
INSERT [dbo].[Product] ([name], [title], [description], [brandId], [ID], [image], [price]) VALUES (N'Giày adidas I-5923 Runner Nam', N'Một mẫu giày là sự kết hợp giữa sự Original và thể thao, khỏe khoắn - Adidas I-5923 Runner', N'Một mẫu giày là sự kết hợp giữa sự Original và thể thao, khỏe khoắn - Adidas I-5923 Runner. Tuy nhiên ở mẫu giày này mục đích chính các nhà sản xuất của Adidas là dùng để tập thể thao nhẹ nhàng với đi bộ hàng ngày. Độ êm ái được đánh giá không kém các dòng NMDs khác. Màu sắc sang trọng, giúp bạn phối hợp được nhiều kiểu quần áo khác nhau nhằm đa dạng hóa cho các bộ Outfit.', 2, 5, N'adidas1.PNG', 700000)
INSERT [dbo].[Product] ([name], [title], [description], [brandId], [ID], [image], [price]) VALUES (N'Giày adidas VS Advantage', N'Giày adidas VS Advantage CL Nam - Trắng', N'Với thiết kế đơn giản nhưng lại vô cùng thanh lịch. Phần Upper của giày được các nhà thiết kế của Adidas sử dụng bằng da bạn tăng thêm độ lịch lãm khi mang. Với các đường kim mũi chỉ hoàn hảo đến từng chi tiết giúp bạn tự tin sải bước. Đây quả thật là một lựa chọn mà các phải mạnh không nên bỏ lỡ.', 2, 6, N'adidas2.PNG', 800000)
INSERT [dbo].[Product] ([name], [title], [description], [brandId], [ID], [image], [price]) VALUES (N'Giày Converse cao cổ đen', N'Giày Converse cao cổ đen', N'Giày Converse cao cổ đen', 3, 8, N'converse1.PNG', 900000)
INSERT [dbo].[Product] ([name], [title], [description], [brandId], [ID], [image], [price]) VALUES (N'Giày Converse cao cấp', N'Giày Converse cao cổ đen', N'Giày Converse cao cổ đen', 3, 9, N'converse2.PNG', 300000)
INSERT [dbo].[Product] ([name], [title], [description], [brandId], [ID], [image], [price]) VALUES (N'Giày Converse màu xanh', N'Giày Converse thấp màu hiếm', N'Giày Converse thấp màu hiếm', 3, 10, N'converse3.PNG', 400000)
INSERT [dbo].[Product] ([name], [title], [description], [brandId], [ID], [image], [price]) VALUES (N'Giày adidas đi ngoài trời', N'Giày adidas là mẫu giày thời trang được rất nhiều các tín đồ yêu thích thời trang lựa chọn đi cùng bản thân', N'Màu sắc được các nhà thiết của Adidas ưu ái lựa chọn màu sắc trẻ trung, năng động. Thuộc trong team Original nên bạn sẽ không bao giờ sẽ phải lo lắng về tình trạng bị lỗi mốt theo dòng thời gian, bởi lẽ điều này đã được chứng minh ở tất cả các người anh đi trước như Stan Smith hay Super Star. Sắp tới Adidas Forest Grove sẽ gia nhập những bộ sậu ấy để trở thành một trong những đôi giày quốc dân. Điểm mạnh cực kỳ cạnh tranh nữa, có thể kể đến là giá cả cực kỳ ổn, phù hợp với tầm tài chính của mọi cánh đàn ông.', 2, 7, N'adidas3.PNG', 500000)
INSERT [dbo].[Product] ([name], [title], [description], [brandId], [ID], [image], [price]) VALUES (N'Giày Van tiện dụng', NULL, NULL, 4, 11, N'vans1.PNG', 600000)
INSERT [dbo].[Product] ([name], [title], [description], [brandId], [ID], [image], [price]) VALUES (N'Giày Van Old Skool', NULL, NULL, 4, 12, N'vans2.PNG', 700000)
INSERT [dbo].[Product] ([name], [title], [description], [brandId], [ID], [image], [price]) VALUES (N'Giày Van Trainer', NULL, NULL, 4, 13, N'vans3.PNG', 800000)
INSERT [dbo].[Product] ([name], [title], [description], [brandId], [ID], [image], [price]) VALUES (N'Giày adidas thể thao', NULL, NULL, 2, 14, N'adidas4.PNG', 90000)
INSERT [dbo].[Product] ([name], [title], [description], [brandId], [ID], [image], [price]) VALUES (N'Giày Converse du lịch', NULL, NULL, 3, 15, N'converse4.PNG', 20000)
INSERT [dbo].[Product] ([name], [title], [description], [brandId], [ID], [image], [price]) VALUES (N'Giày thể thao NIKE DARWIN', N'Giày thể thao nam Nike Darwin 819803-401 màu xanh dương nhạt​ ', N'Giày thể thao nam Nike Darwin 819803-401 màu xanh dương nhạt​ với thiết kế kiểu dáng cùng gam màu thời trang, mang đến cho bạn nam sự trẻ trung, năng động nhưng cũng không kém phần sành điệu dù là đang tham gia các hoạt động thể thao hay phối cùng các trang phục hàng ngày khác. Bên cạnh đó, giày được may từ chất liệu vải thể thao chuyên dụng Polyester, bề mặt và lớp lót dạng lưới thoáng khí, mũi giày đầy đặn bảo vệ đầu ngón chân; đế cao su nhẹ và siêu bền chống trơn trượt hiệu quả, đem lại sự thoải mái và dễ chịu khi tiếp đất.', 1, 16, N'nike1.PNG', 20000)
SET IDENTITY_INSERT [dbo].[Product] OFF
ALTER TABLE [dbo].[Cart]  WITH CHECK ADD FOREIGN KEY([userid])
REFERENCES [dbo].[Account] ([userid])
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD FOREIGN KEY([brandId])
REFERENCES [dbo].[Brand] ([id])
GO
