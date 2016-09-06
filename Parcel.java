class Parcel {
  public Integer mHeight;
  public Integer mWidth;
  public Integer mDepth;
  public Integer mWeight;

  public Parcel(Integer height, Integer width, Integer depth, Integer weight) {
    mHeight = height;
    mWidth = width;
    mDepth = depth;
    mWeight = weight;
  }

  public Integer volume() {
    return mHeight * mWidth * mDepth;
  }

  public Integer costToShip() {
    return this.volume() * mWeight;
  }

}
